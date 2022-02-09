package cjqc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		List<Stu> list = new ArrayList();//ȫ�ֱ���������ÿ�βٿص���ͬһ������

		while (true) {
			//����
			System.out.println("********ѧ����Ϣ����ϵͳ********");
			System.out.println("1->��ѯѧ��");
			System.out.println("2->����ѧ��");
			System.out.println("3->�޸�ѧ��");
			System.out.println("4->ɾ��ѧ��");
			System.out.println("0->�˳�ϵͳ");

			String key  = new Scanner(System.in).nextLine();// �����û������key��ʹ��switch caseƥ��

			switch (key) {
			case "1":
				findAll(list);//��ѯҵ��
				break;
			case "2":
				System.out.println("���������ӵ�ѧ�����");
				String id = new Scanner(System.in).nextLine();
				System.out.println("���������ӵ�ѧ������");
				String name = new Scanner(System.in).nextLine();
				add(list, id, name);//����ҵ��
				break;
			case "3":
				System.out.println("������Ҫ�޸ĵ�ѧ�����");
				String editID = new Scanner(System.in).nextLine();
				System.out.println("������Ҫ�޸ĵ�ѧ������");
				String editName = new Scanner(System.in).nextLine();
				edit(list, editID, editName);//�༭ҵ��
				break;
			case "4":
				System.out.println("������Ҫɾ����ѧ�����");
				String delID = new Scanner(System.in).nextLine();
				delete(list, delID);//ɾ��ҵ��
				break;
			default://�����д�ˣ�����1234�����˳�
				System.out.println("�˳�ϵͳ");
				System.exit(0);//�˳�����
				break;
			}
		}

	}

	public static void findAll(List<Stu> list) {
		//��ѯǰ�жϼ����Ƿ�Ϊ��

		if (list.size() == 0) {
			System.out.println("����ѧ����Ϣ���뷵������");
			return;
		} else {
			for (Stu stu : list) {
				System.out.println(stu.getName());//����ֻ����ʾѧ������
			}
		}

	}

	public static void add(List<Stu> list, String id, String name) {
		
		//���ǰ�ж�ѧ���Ƿ����

		for (Stu stu : list) {
			if (stu.getId().equals(id)) {
				System.out.println("ѧ�ų�ͻ��������");
				return;
			}
		}

		Stu s = new Stu(id, name);
		list.add(s);
		System.out.println("��ӳɹ�");
	}

	public static void edit(List<Stu> list, String editID, String editName) {
		
		//�༭ǰ�ж�ѧ���Ƿ����

		for (Stu stu : list) {
			if (!stu.getId().equals(editID)) {
				System.out.println("��ѧ�������ڣ�������");
				return;
			} else {

				stu.setName(editName);
				list.set(Integer.parseInt(editID) - 1, stu);//ע��-1������������Խ��
				System.out.println("�޸ĳɹ�");
			}

		}

	}

	public static void delete(List<Stu> list, String delID) {

		//ɾ��ǰ�ж�ѧ���Ƿ����
		for (Stu stu : list) {
			if (!stu.getId().equals(delID)) {
				System.out.println("��ѧ�������ڣ�������");
				return;
			} else {

				list.remove(Integer.parseInt(delID) - 1);
				System.out.println("ɾ���ɹ�");
				break;
	// ����ʱ���break������ʡ�ԣ�������ɾ��Ԫ���Ѿ��ı��������������� ->java.util.ConcurrentModificationException
			}

		}

	}

}

