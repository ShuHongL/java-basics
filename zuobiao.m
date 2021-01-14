function [x, y] = zuobiao()
clc;
clear;
paths=[pwd,'\filename\'];                                                                                        %创建文件路径
[filename,paths]=uigetfile({'*.bmp;*.jpg;*.tif;*.gif'},'newpic');%根据当前路径打开文件(bmp,jpg,tif,gif)
I = imread(filename);          %读入需要处理的图片

%figure;
%imshow(I);

%根据电极颜色二值化图像
[mm,nn,z] = size(I);
image = zeros(mm, nn);
for ii=1:mm
    for jj=1:nn
        R = I(ii,jj,1);
        G = I(ii,jj,2);
        B = I(ii,jj,3);
        RG = (double(R)-double(G))/double(G);
        RB = (double(R)-double(B))/double(B);
        BG = (double(B)-double(G))/double(G);
        if (RG<0 && RG>-0.4 && RB<0 && RB>-0.6 && BG<0.5 && BG >-0.1) || (RG<0.3 && RG>0.08 && RB<1.8 && RB>0.3 && BG<-0.1 && BG >-0.3)  % 这些阈值可以根据统计大量图片进行调整
            image(ii, jj) = 1;
        end
    end
end
%figure;imshow(image);title('gray');

% 以下参考的该链接https://blog.csdn.net/qq_33414271/article/details/78773858
bw = bwareaopen(image, 200);
se = strel('disk', 10);  
se1 = strel('disk', 1); 
bw = imclose(bw, se);
bw = imfill(bw, 'holes');  
bw =imdilate(bw,se1);
%figure;imshow(bw);title('denoise');

[B, L] = bwboundaries(bw, 'noholes');
stats = regionprops(L,'Area','Centroid');
threshold = 0.52;
temp = 0
for k = 1:length(B) %遍历每一个连通分量
  boundary = B{k};
  % 计算半径
  delta_sq = diff(boundary).^2;    
  perimeter = sum(sqrt(sum(delta_sq,2)));
  area = stats(k).Area;
  metric = 4*pi*area/perimeter^2;
  if metric >= threshold
      temp = max(temp, metric);
  end
end
for k = 1:length(B) %遍历每一个连通分量
  boundary = B{k};
  % 计算半径
  delta_sq = diff(boundary).^2;    
  perimeter = sum(sqrt(sum(delta_sq,2)));
  area = stats(k).Area;
  metric = 4*pi*area/perimeter^2;
  if metric == temp
    centroid = stats(k).Centroid;
    hold on
    x = centroid(1);
    y = centroid(2);
    disp(x)
    disp(y)
%     plot(centroid(1),centroid(2),'r*'); %如果哪个连通分量的判断结果大于0.82，则在中心标记，其中坐标为（centroid(1),centroid(2)）
  end
end
hold off
 
 


end
