import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.acos;
import static java.lang.Math.sqrt;

public class TriangleEquations {
    public static void main (String[] Args){
//        Scanner r=new Scanner(System.in);
//        System.out.println("enter the height of the triangle");
//        int h =r.nextInt();
//        System.out.println("enter the base of the triangle");
//        int b =r.nextInt();
//        System.out.println("enter the hypotenuse of the triangle");
//        int hy =r.nextInt();
//
//        int p=h+b+hy;
//        int a = (b*h)/2;
//        System.out.println("the perimeter is :  "+p);
//        System.out.println("the the area is :  "+a);

        equations();
    }
    static void equations(){
        DecimalFormat df =new DecimalFormat("0.00");
        Scanner coordinates=new Scanner(System.in);
        System.out.println("enter the coordinates of X1");
        int x1 =coordinates.nextInt();
        System.out.println("enter the coordinates of Y1");
        int y1 =coordinates.nextInt();

        System.out.println("enter the coordinates of X2");
        int x2 =coordinates.nextInt();
        System.out.println("enter the coordinates of Y2");
        int y2 =coordinates.nextInt();
        System.out.println("enter the coordinates of X3");
        int x3 =coordinates.nextInt();
        System.out.println("enter the coordinates of Y3");
        int y3 =coordinates.nextInt();
        int modAC=(int)Math.sqrt((((x3-x1)*(x3-x1))+((y3-y1)*(y3-y1))));
        int modAB=(int)Math.sqrt((((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1))));
        int modBC=(int)Math.sqrt((((x3-x2)*(x3-x2))+((y3-y2)*(y3-y2))));
        double anglea=((double) ((((x2 - x1) * (x3 - x1)) + ((y2 - y1) * (y3 - y1)))) /(modAB*modAC));
        double angleb= (double) ((x2 - x1) * (x3 - x2) + (y2 - y1) * (y3 - y2)) /(modAB*modBC);
        double anglec= ((double) ((((x3 - x1) * (x3 - x2)) + ((y3 - y1) * (y3 - y2)))) /(modBC*modAC));
        double angleA= Math.toDegrees(acos(anglea));
        double angleB=  Math.toDegrees(acos(angleb));
        double angleC=  Math.toDegrees(acos(anglec));
        System.out.println("the  AngleA is:"+df.format(angleA)+"degrees");
        System.out.println("the  AngleB is:"+df.format(angleB)+"degrees");
        System.out.println("the  AngleC is:"+df.format(angleC)+"degrees");
        double perimeter=((modAB)+(modAC)+(modBC));
        double s=(((x1*y2)+(x2*y3)+(x3*y1)-((x1*y3)+(x3*y2)+(x2*y1)))/2);
        if (s>0){

            System.out.println("the area is:"+df.format(s)+" U.A");}
        else System.out.println("the area is:"+df.format(s*-1)+" U.A");
        System.out.println("the perimeter is:"+df.format(perimeter)+" LU");
        System.out.println("here is the equations for the side AC:");
        System.out.println("the vector equation is:");
        System.out.println("X"+"="+"X0"+"+"+"U1");
        System.out.println("Y"+"="+"Y0"+"+"+"U2");
        System.out.println("the parametric eq is:");
        System.out.println("X"+"="+x1+"X"+"+"+(x3-x1)+"y");
        System.out.println("Y"+"="+y1+"X"+"+"+(y3-y1)+"y");
        System.out.println("symmetric eq is");
        System.out.println("x+"+(-x1)+"/"+(x3-x1)+"="+"y+"+(-y1)+"/"+(y3-y1));
        System.out.println("analytical implicit eq is");
        double  a=(y3-y1);
        double b=-(x3-x1);
        double c1=-(x1)*(y3-y1);
        double c2=(y1)*(x3-x1);
        double C=(c1)+(c2);
        System.out.println("A.I"+"="+(a)+"X"+"+"+(b)+"Y"+"+"+ (C)+"=0");
        System.out.println("analytical explicit eq is");

        double k=-a/b;
        double m=-C/b;
        System.out.println("Y="+ (k)+"X"+"+"+(m));
        System.out.println("the normal equation is");
        int numerator= (int)Math.sqrt(((a*a)) + ((b*b)));
        double p= C/numerator;
        System.out.println("N.E="+(a/numerator)+"X"+"+"+(b/numerator)+"y"+"+"+(p)+"=0");
        System.out.println(" the polar equation is");
        System.out.println("r="+df.format(p)+"/1+eCosO=0");
        System.out.println("intercepts Eq");
        System.out.println("I.E="+"X"+"/"+df.format(-C/a)+"+"+"Y"+"/"+df.format(-C/b)+"=1");

        System.out.println("median equations for AC (MeB):");
        double  xprime=((double) (x1 + x3) /2);
        double yprime = ((double) (y1 + y3) /2);
        double bprime=(xprime)+(yprime);
        double xBBprime=(xprime-x2);
        double yBBprime=(yprime-y2);
        System.out.println("parametric equations of (MeB):");
        System.out.println("X"+"="+(x2)+"X"+"+"+(xBBprime)+"y");
        System.out.println("Y"+"="+(y2)+"X"+"+"+(yBBprime)+"y");
        System.out.println("symmetric eq is");
        System.out.println("x+"+-(x2)+"/"+(xBBprime)+"="+"y+"+-(y2)+"/"+(yBBprime));
        System.out.println("analytical implicit eq for MeB is:");
        double  Ac=(yBBprime);
        double Bc=-(xBBprime);
        double c11=-(x2*(yBBprime));
        double c22=y2*(xBBprime);
        double CC=(c11)+(c22);
        double lc=Math.sqrt((xBBprime*xBBprime)+(yBBprime*yBBprime));
        System.out.println("A.I"+"="+(Ac)+"X"+"+"+(Bc)+"Y"+"+"+ (CC)+"=0");
        System.out.println("analytical explicit eq FOR MeB is:");

        double kB=-Ac/Bc;
        double mB=-CC/Bc;
        System.out.println("Y="+ (kB)+"X"+"+"+(mB));
        System.out.println("the length for MeB");
        System.out.println("l of MeB="+df.format(lc)+" LU");
        System.out.println("Altitude equation for AC (Hb):");
        double k22= (-1/k);
        double hbx=(k22*x2);
        double mh=y2-hbx;
        System.out.println("A.E:"+"Y="+df.format(hbx)+"X"+"+" +df.format(mh));
        System.out.println("A.I:"+df.format(k22)+"X"+"+"+df.format(-y2)+"Y+"+df.format(mh));
        System.out.println("the length of altitude Hb");
        double q=(modAB+modAC+modBC)/2;
       double SquareRoot=sqrt(q*(q-modBC)*(q-modAC)*(q-modAB));
        double hb= (2*SquareRoot)/modAC;
        System.out.println("the length of altitude Hb Hb is:"+hb);
        System.out.println("perpendicular bisector line for AC (Mb):");
        double k2=(-1/k);
        double mbx=(k2*xprime);
        double mprime=yprime-mbx;
        System.out.println("A.E:"+"Y="+df.format(mbx)+"X"+"+" +df.format(mprime));
        System.out.println("A.I:"+df.format(k2)+"X"+"+"+df.format(-yprime)+"Y+"+df.format(mprime));

        System.out.println("the Centroid:");
        double g1= (double) (x1 + x2 + x3) /3;
        double g2= (double) (y1 + y2 + y3) /3;
        System.out.println("G"+"( "+df.format(+g1)+","+df.format(+g2)+" )");
        System.out.println("the in center:");
        double ix=((modBC*x1)+(modAC*x2)+(modAB*x3))/perimeter;
        double iy=((modBC*y1)+(modAC*y2)+(modAB*y3))/perimeter;

        System.out.println("I"+"("+df.format(ix)+","+df.format(iy)+")");
        System.out.println("equations of incenter:");
        double r=(2*s/perimeter);
        System.out.println("F="+"("+"X-"+ix+")"+"^2"+"+"+"("+"X-"+iy+")"+"^2"+"="+df.format(r*r));
        int u1=((y1*y1)+(x2*x3));
        int u2=((y2*y2)+(x1*x3));
        int u3=((y3*y3)+(x1*x2));
        int v1=((x1*x1)+(y2*y3));
        int v2=((x2*x2)+(y1*y3));
        int v3=((x3*x3)+(y1*y2));
        double Hx=((((y1*u2)+(u1*y3)+(y2*u3))-((u1*y2)+(y1*u3)+(u2*y3)))/(2*s));
        double Hy=((((v1*x2)+(x1*v3)+(v2*x3))-((v2*x1)+(x3*v1)+(v3*x2)))/(2*s));
        System.out.println("The orthocenter:");
        System.out.println("H"+"("+df.format(Hx)+","+df.format(Hy)+")");

        int u11=((y1*y1)+(x1*x1));
        int u22=((y2*y2)+(x2*x2));
        int u33=((y3*y3)+(x3*x3));
        double Ox=((((y1*u22)+(u11*y3)+(y2*u33))-((u11*y2)+(u33*y1)+(u22*y3)))/(4*s));
        double Oy=((((x1*u22)+(u11*x3)+(x2*u33))-((u11*x2)+(x1*u33)+(u22*x3)))/(4*s));
        System.out.println("The circumcenter:");
        System.out.println("O"+"("+df.format(Ox)+","+df.format(Oy)+")");
        System.out.println("The equation of circumcircle:");
        double R=((modAB*modAC*modBC)/(4*s));
        System.out.println("F="+"("+"X-"+df.format(Ox)+")"+"^2"+"+"+"("+"X-"+df.format(Oy)+")"+"^2"+"="+(R*R));
        System.out.println("The area of circumcircle:");
        double Circumcircle=((4*3.14)*(R*R));
        System.out.println("A="+df.format(Circumcircle)+"U.A");
        
    }}

