
import javax.swing.JOptionPane;
 
public class Game
{
    public static void main(String args[])
    {
        JOptionPane.showMessageDialog(null,"��ӭ����ʯͷ����������������Ϸ!","ʯͷ����������������Ϸ",
                        JOptionPane.INFORMATION_MESSAGE);
        int man,computer;
        int player,comp;
        man = computer = 0;
        while(man != 2 && computer != 2)
        {
            String string = JOptionPane.showInputDialog(null,"���������ָ��:ʯͷ(1),����(2),��(3):"
                    ,"���봰��",JOptionPane.QUESTION_MESSAGE);
            player = Integer.parseInt(string);
            comp = (int)(System.currentTimeMillis() % 3) + 1;
            if((player == 1 && comp == 2) || (player == 2 && comp == 3) || (player == 3 && comp == 1))
            {
                man++;
                computer = 0;
                JOptionPane.showMessageDialog(null,"��Ӯ��!","ʯͷ����������������Ϸ",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            else if((player == 1 && comp == 3) || (player == 2 && comp == 1) || (player == 3 && comp == 2))
            {  
                computer++;
                man = 0;
                JOptionPane.showMessageDialog(null,"������!","ʯͷ����������������Ϸ",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                man = computer = 0;
                JOptionPane.showMessageDialog(null,"��ִ�ƽ!","ʯͷ����������������Ϸ",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if(man == 2)
        {
            JOptionPane.showMessageDialog(null,"��ϲ��ȡ���˻�ս��ʤ��!","ʯͷ����������������Ϸ",
                        JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"���ź��������.","ʯͷ����������������Ϸ",
                        JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
  