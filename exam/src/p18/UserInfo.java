package p18;

public class UserInfo {
	private int uiNo;
	private String uiName;
	private int uiAge;
	private String uiId;
	private String uiPwd;
	private int uiCiNo;
	private String uiRegDate;
	private String address;
	
	@Override
	public String toString() {
		return "UserInfo [uiNo=" + uiNo + ", uiName=" + uiName + ", uiAge=" + uiAge + ", uiId=" + uiId + ", uiPwd="
				+ uiPwd + ", uiCiNo=" + uiCiNo + ", uiRegDate=" + uiRegDate + ", address=" + address + "]";
	}
	public int getUiNo() {
		return uiNo;
	}
	public void setUiNo(int uiNo) {
		this.uiNo = uiNo;
	}
	public String getUiName() {
		return uiName;
	}
	public void setUiName(String uiName) {
		this.uiName = uiName;
	}
	public int getUiAge() {
		return uiAge;
	}
	public void setUiAge(int uiAge) {
		this.uiAge = uiAge;
	}
	public String getUiId() {
		return uiId;
	}
	public void setUiId(String uiId) {
		this.uiId = uiId;
	}
	public String getUiPwd() {
		return uiPwd;
	}
	public void setUiPwd(String uiPwd) {
		this.uiPwd = uiPwd;
	}
	public int getUiCiNo() {
		return uiCiNo;
	}
	public void setUiCiNo(int uiCiNo) {
		this.uiCiNo = uiCiNo;
	}
	public String getUiRegDate() {
		return uiRegDate;
	}
	public void setUiRegDate(String uiRegDate) {
		this.uiRegDate = uiRegDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
