package Main;

public class Task18 {

    /**
     * � ������ public static void hackSalary(int a) ������� �������� �� 100 � ������ �� ����� �������: "���� �������� ����������: <a+100> �������� � �����."
     * ��� <a+100> - ��� �������� ����������� �� 100.
     * <p>
     * ������ ������ �� ����� ��� � = 700:
     * ���� �������� ����������: 800 �������� � �����.
     * <p>
     * <p>
     * ����������:
     * 1. ��������� ������ �������� ����� �� �����.
     * 2. ����� main �� ������ �������� System.out.println ��� System.out.print.
     * 3. ����� hackSalary �� ������ ���������� ���������.
     * 4. ����� main ������ ������� ����� hackSalary ������ ���� ���.
     * 5. ����� hackSalary ������ ��������� ���������� ����� �� 100 � ������� �� ����� ������� �������� �������.
     */

    public static void task() {
        hackSalary(700);
    }

    public static void hackSalary(int a) {
        // �������� ��� ��� ���
    	System.out.println(String.format("���� �������� ����������: %d �������� � �����.", a + 100));
    }
}
