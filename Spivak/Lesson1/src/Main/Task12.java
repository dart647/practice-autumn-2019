package Main;

public class Task12 {

    /**
     * ������ �� ����� ����������, �������� ������� �������� ���������� �������. ������ ���������� ������ � ����� ������.
     * <p>
     * <p>
     * ����������:
     * 1. ��������� ������ �������� �����.
     * 2. ������ �������� ������ � ����������� ����������.
     * 3. ��������� ����� ������ �������� �� 2 �����.
     * 4. ��������� ������ �������� ����������, �������� ������� �������� ���������� �������.
     * 5. ��������� �� ������ �������� ����������, �������� ������� �� �������� ���������� �������.
     */

    public static void task() {
        String apple = "������";
        String porridge = "����";
        String sausage = "�������";
        String peach = "������";
        String str = apple + " " + porridge + " " + sausage + " " + peach;  
        String str1[] = str.split(" ");

        //�������� ��� ��� ���
        for (String fruits : str1)
        {
        	if (fruits.equals("������") || fruits.equals("������"))
        		System.out.println(fruits);
        }
    }
}