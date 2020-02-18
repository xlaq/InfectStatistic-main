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

}
class province{
	private int[] name = new int[35];
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
	Map<String,Integer> map1 = new HashMap<String, Integer>();
	province() {
		for (int i = 0; i < name.length; i++) {
			name[i] = 0;
			name[i]=i;
		}
		for (int i = 0; i < name.length; i++) {
			map1.put(provinceList[i], i);
			
		}
	};
	public int getIp() {
		return ip;
	}
	public void setIp(int ip) {
		this.ip = ip;
	}
	public int getSp() {
		return sp;
	}
	public void setSp(int sp) {
		this.sp = sp;
	}
	public int getCure() {
		return cure;
	}
	public void setCure(int cure) {
		this.cure = cure;
	}
	public int getDead() {
		return dead;
	}
	public void setDead(int dead) {
		this.dead = dead;
	}
    public String printResult(){
        return name+" ��Ⱦ����"+ip+"��"+" ���ƻ���"+sp+"��"+ " ����"+cure+"��"+" ����"+dead+"��";
    }
    public String printIp(){
        return " ��Ⱦ����"+ip+"��";
    }
    public String printSp(){
        return " ���ƻ���"+sp+"��";
    }
    public String printCure(){
        return " ����"+cure+"��";
    }
    public String printDead(){
        return " ����"+dead+"��";
    }
			
}