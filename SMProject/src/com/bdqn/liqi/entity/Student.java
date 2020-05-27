package com.bdqn.liqi.entity;

public class Student {
		private int stu_no;
		private String stu_name;
		private int stu_age;
		
		
		
		public Student() {
			
		}
		public Student(int stu_no, String stu_name, int stu_age) {
			this.stu_no = stu_no;
			this.stu_name = stu_name;
			this.stu_age = stu_age;
		}
		public int getStu_no() {
			return stu_no;
		}
		public void setStu_no(int stu_no) {
			this.stu_no = stu_no;
		}
		public String getStu_name() {
			return stu_name;
		}
		public void setStu_name(String stu_name) {
			this.stu_name = stu_name;
		}
		public int getStu_age() {
			return stu_age;
		}
		public void setStu_age(int stu_age) {
			this.stu_age = stu_age;
		}
		@Override
		public String toString() {
			return "Student [stu_no=" + stu_no + ", stu_name=" + stu_name + ", stu_age=" + stu_age + ", getStu_no()="
					+ getStu_no() + ", getStu_name()=" + getStu_name() + ", getStu_age()=" + getStu_age()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}

}
