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
			 "全国", "安徽", "澳门" ,"北京",
			 "重庆", "福建","甘肃","广东",
			 "广西", "贵州", "海南", "河北",
		     "河南", "黑龙江", "湖北", "湖南",
		     "吉林","江苏", "江西", "辽宁",
			 "内蒙古", "宁夏", "青海", "山东",
			 "山西", "陕西", "上海","四川",
			 "台湾", "天津", "西藏", "香港",
		     "新疆", "云南", "浙江"	
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
        return name+" 感染患者"+ip+"人"+" 疑似患者"+sp+"人"+ " 治愈"+cure+"人"+" 死亡"+dead+"人";
    }
    public String printIp(){
        return " 感染患者"+ip+"人";
    }
    public String printSp(){
        return " 疑似患者"+sp+"人";
    }
    public String printCure(){
        return " 治愈"+cure+"人";
    }
    public String printDead(){
        return " 死亡"+dead+"人";
    }
			
}