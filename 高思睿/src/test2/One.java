package test2;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������ָ�����");
		int n=sc.nextInt();
		while(n<1|n>100) {
			System.out.println("�������������ָ�����");
			n = sc.nextInt();
		}
		System.out.println("�������������֣�");
		//�õ�����̨�ϵ�����
		String s = sc.nextLine();
		
		//������̨�ϵ�����ת��Ϊ������ʽ
		  String input = sc.nextLine();
          String[] strArr=input.split(" ");

		int[] num1=new int[strArr.length];
		//���ν��ַ��������е�Ԫ��ӳ�䵽int���͵�������
		for(int i=0;i<num1.length;i++) {
			num1[i]=Integer.parseInt(strArr[i]);
		}
		//���������еĸ������õ�Ԫ��a1,a2�ȣ��ֱ��������Ԫ��ȫ��Ϊa1����a2���õ�����Сtotal number of coins
		int[] num2=new int[strArr.length];
		int size=0;//��Ϊ�����в�ͬԪ�صĸ���
		//���ν�ǰ���Ԫ��������Ԫ�ضԱȣ������Ԫ�ز�����ǰ���Ԫ�����Ƚ�
		for(int i=0;i<num1.length;i++) {
			for(int j=0;j<num1.length;j++) {
				if(num1[i]!=num1[j]) {
					size++;
				}
			}
		}
		
		
		
	}

}
