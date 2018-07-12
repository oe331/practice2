package Ohjsp.ch07; /** * File : AddrBean.java * Desc : 주소록 빈즈 클래스 * @author 오의택(oe331@naver.com) */ public class AddrBean { private String username; private String tel; private String email; private String sex; public String
getUsername() { return username; } public void setUsername(String username) { this.username = username; } public String getTel() { return tel; } public void setTel(String tel) { this.tel = tel; } public String getEmail() { return email; } public void
setEmail(String email) { this.email = email; } public String getSex() { return sex; } public void setSex(String sex) { this.sex = sex; } } 5.AddrManager.java package Ohjsp.ch07; import java.util.ArrayList; import java.util.List; /** * File :
AddrManager.java * Desc : 주소록 관리 클래스 * @author 오의택(oe331@naver.com) */ public class AddrManager { List<AddrBean>
  addrlist = new ArrayList<AddrBean>(); public void add(AddrBean ab) { addrlist.add(ab); } public List<AddrBean>
      getAddrList() {
return addrlist;
}

public AddrBean getAddr(String username) {
for(AddrBean ab : addrlist) {
if(ab.getUsername().equals(username))
return ab;
}
return null;
}
}
