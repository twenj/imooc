package com.imooc.model;

public class Job {
	// ��Ա���ԣ�ְ���š���������
	private String jobNo;
	private String jobName;
	
	public Job() {
		
	}
	public Job(String jobNo, String jobName) {
		this.setJobNo(jobNo);
		this.setJobName(jobName);
	}
	
	public String getJobNo() {
		return this.jobNo;
	}
	public void setJobNo(String jobNo) {
		this.jobNo = jobNo;
	}
	public String getJobName() {
		return this.jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
}
