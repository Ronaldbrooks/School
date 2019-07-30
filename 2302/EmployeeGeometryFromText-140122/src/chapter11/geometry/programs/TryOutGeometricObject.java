package chapter11.geometry.programs;

import chapter11.geometry.GeometricObject;

public class TryOutGeometricObject {
	
	public static void main(String[] args) {
		GeometricObject go1 = new GeometricObject();
		System.out.println(go1);
		GeometricObject go2 = new GeometricObject("smoke", true);
		System.out.println(go2);
		}
	}
