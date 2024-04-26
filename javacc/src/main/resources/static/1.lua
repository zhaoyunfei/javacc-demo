a=2
b=2
PTP(100,100,0,0,0,0,0,0,0,0)
for c=0,2,1 do
 Lin(测试,100,0,0,0,0,0,0,0,0)
 if a≥b then
    ARC(测试1,100,0,0,0,0,0,0,0,0)
 end
 Circle(测试2,100,0,0,0,0,0,0,0,0)
end
if a==b then
 for c=0,2,1 do
  PTP(100,100,0,0,0,0,0,0,0,0)
  ARC(测试2,100,0,0,0,0,0,0,0,0)
  if a==b then
   Circle(测试2,100,0,0,0,0,0,0,0,0)
  end
  for i=1,2,1 do
   Lin(100,100,0,0,0,0,0,0,0,0)
  end
 end
end
for c=0,2,1 do
 PTP(100,100,0,0,0,0,0,0,0,0)
 Lin(测试2,100,0,0,0,0,0,0,0,0)
end


for c=1,2 do
 PTP(100,100,0,0,0,0,0,0,0,0)
 if c==1 then
     Lin(100,100,0,0,0,0,0,0,0,0)
     for i=1,3 do
         if i==1 then
             Circle(圆1,100,0,0,0,0,0,0,0,0)
            goto continue
         end
          Circle(圆,100,0,0,0,0,0,0,0,0)
     end
    ::continue::
 end
 ARC(测试2,100,0,0,0,0,0,0,0,0)
end

d=1
while(d<3) do

    if d==1 then
 PTP(while11,100,0,0,0,0,0,0,0,0)
 break
 end

  d=d+1
end
