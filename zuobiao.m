function [x, y] = zuobiao()
clc;
clear;
paths=[pwd,'\filename\'];                                                                                        %�����ļ�·��
[filename,paths]=uigetfile({'*.bmp;*.jpg;*.tif;*.gif'},'newpic');%���ݵ�ǰ·�����ļ�(bmp,jpg,tif,gif)
I = imread(filename);          %������Ҫ�����ͼƬ

%figure;
%imshow(I);

%���ݵ缫��ɫ��ֵ��ͼ��
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
        if (RG<0 && RG>-0.4 && RB<0 && RB>-0.6 && BG<0.5 && BG >-0.1) || (RG<0.3 && RG>0.08 && RB<1.8 && RB>0.3 && BG<-0.1 && BG >-0.3)  % ��Щ��ֵ���Ը���ͳ�ƴ���ͼƬ���е���
            image(ii, jj) = 1;
        end
    end
end
%figure;imshow(image);title('gray');

% ���²ο��ĸ�����https://blog.csdn.net/qq_33414271/article/details/78773858
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
for k = 1:length(B) %����ÿһ����ͨ����
  boundary = B{k};
  % ����뾶
  delta_sq = diff(boundary).^2;    
  perimeter = sum(sqrt(sum(delta_sq,2)));
  area = stats(k).Area;
  metric = 4*pi*area/perimeter^2;
  if metric >= threshold
      temp = max(temp, metric);
  end
end
for k = 1:length(B) %����ÿһ����ͨ����
  boundary = B{k};
  % ����뾶
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
%     plot(centroid(1),centroid(2),'r*'); %����ĸ���ͨ�������жϽ������0.82���������ı�ǣ���������Ϊ��centroid(1),centroid(2)��
  end
end
hold off
 
 


end
