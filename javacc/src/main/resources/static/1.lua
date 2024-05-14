a=2
b=2
PTP(点1,100,0,0,0,0,0,0,0,0)
for c=0,2,1 do
 Lin(直线1,100,0,0,0,0,0,0,0,0)
 if a≥b then
    ARC(圆弧1,100,0,0,0,0,0,0,0,0)
 end
 Circle(圆1,100,0,0,0,0,0,0,0,0)
end
if a==b then
 for c=0,2,1 do
  PTP(点2,100,0,0,0,0,0,0,0,0)
  ARC(圆弧2,100,0,0,0,0,0,0,0,0)
  if a==b then
   Circle(圆2,100,0,0,0,0,0,0,0,0)
  end
  for i=1,2,1 do
   Lin(直线2,100,0,0,0,0,0,0,0,0)
  end
 end
end
for c=0,2,1 do
 PTP(点3,100,0,0,0,0,0,0,0,0)
 Lin(直线3,100,0,0,0,0,0,0,0,0)
end
for c=1,2 do
 PTP(点4,100,0,0,0,0,0,0,0,0)
 if c==1 then
     Lin(直线4,100,0,0,0,0,0,0,0,0)
     for i=1,3 do
         if i==1 then
             Circle(圆3,100,0,0,0,0,0,0,0,0)
            goto continue
         end
          Circle(圆4,100,0,0,0,0,0,0,0,0)
     end
    ::continue::
 end
 ARC(圆弧3,100,0,0,0,0,0,0,0,0)
end
d=1
while(d<3) do
 if d==1 then
	PTP(点5,100,0,0,0,0,0,0,0,0)
	break
 end
 d=d+1
end


