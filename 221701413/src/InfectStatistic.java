import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.sun.corba.se.spi.activation.InitialNameServicePackage.NameAlreadyBound;
import com.sun.xml.internal.bind.v2.runtime.Name;

/**
 * InfectStatistic
 * TODO
 *
 * @author 221701413
 * @version xxx
 * @since xxx
 */
class InfectStatistic {
	public static void main(String[] args) {
       
	}

class province{
	public int[] name =new int[32];
	private int ip = 0;
	private int sp = 0;
	private int cure = 0;
	private int dead = 0;
	String[] provinceList= {
			 "ȫ��", "����", "����" ,"����",
			 "����", "����","����","�㶫",
			 "����", "����", "����", "�ӱ�",
		     "����", "������", "����", "����",
		     "����","����", "����", "����",
			 "���ɹ�", "����", "�ຣ", "ɽ��",
			 "ɽ��", "����", "�Ϻ�","�Ĵ�",
			 "̨��", "���", "����", "���",
		     "�½�", "����", "�㽭"	
	};


}			
 class cmdList{
	 public String args[];
	    cmdList(String args[]) {
	        this.args = args;
	    }
 }
	 public void cmdGet(String [] args)
		{
			if(args.length > 0 && args[0].matches("list"))
			{
				for(int i = 1;i+1<args.length;i++)
				{
					if(args[i].matches("-.*"))
					{
						switch(args[i])
						{
						case "-log":String log;log = args[i+1];break;
						case "-out":String out;out = args[i+1];break;
						case "-date":String date;date = args[i+1];break;
						case "-province":
							for(;;i++)
							{
								if(i+1<args.length)
								{
								if(!args[i+1].matches("-.*"))
								{
									
								}else
									break;
								}else
									break;
							}
							break;
						case "-type":
							for(int k=0;;i++,k++)
							{
								if(i+1<args.length)
								{
								if(!args[i+1].matches("-.*"))
								{
									
								}else
									break;
								}else
									break;
							}
							break;
						default:
							System.out.print("����������"+args[i]+"����������");
							System.exit(0);
						}
					}
				}
			}else
			{
				System.out.print("û��list,����������");
			}
         }
}
