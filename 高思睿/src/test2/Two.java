package test2;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Two {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ��������������ָ�����");
		int num = sc.nextInt();
		while(num<2|num>100) {
			System.out.println("�����������ַ��������������ָ�����");
			num = sc.nextInt();
		}
		System.out.println("������capital Latin�ַ�����");
		String s1 = sc.nextLine();
		String[] s2=s1.split(" ");
		//String[] s2=new String[num];
		//����ȡ�����ݽ��зָ�
				
//		for(int i=0;i<num;i++) {
//			System.out.println(s2[i]);
//		}
		System.out.println(s2.length);
		//�����������
		//���ñ���ֱ�������ڵ�������ĸ�������Ԫ��
		String a2[]=new String[num-1];
		for(int i=0;i<num;i++) {
			String a1=s2[i]+s2[++i];
			a2[i]=a1;
	    }
		int cishu[]= new int[num-1];
		for(int i=0;i<(num-1);i++) {
			for(int j=1;j<(num-1);j++) {
				if(a2[i]==a2[j]) {
					cishu[i]++;
				}
				
		    }
	    }
		//��ʱ�ҵ�cishu���������ֵ��Ӧ���±�
		//cishu���ֵ�±���a2�����±���ͬ���õ���a2�����Ӧ�±��Ԫ��ֵ��Ϊ������
		int one=cishu[0];
		int index=0;
		//����forѭ���õ����ֵ
		for(int j=1;j<cishu.length;j++) {
			if(one<cishu[j]) {
				one=cishu[j];
				index=j;
				
			}
		System.out.println("���Ϊ"+a2[index]);

	}

	}
}
