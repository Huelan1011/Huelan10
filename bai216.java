package day2;

import java.util.Scanner;

//Đếm số lượng số chẵn có trong mảng một chiều các số nguyên
public class bai216 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Nhap n so phan tu mang");
		int n = in.nextInt();
		int[] arr = new int [n];
	// Nhap gia tri cho tung phan tu
		for (int i=0;i<n;i++) {
		System.out.print("Arr[" + (i+1)+"] ");
		arr[i] = in.nextInt();
		}
		int cout =0;
		for (int i=0;i<n;i++) {
			if(arr[i]%2==0)cout++;
		}
System.out.println("so luong so chan la: " + cout);
	in.close();
	}

}
