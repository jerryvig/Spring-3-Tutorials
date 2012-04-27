package com.mkyong.user.action;

import com.mkyong.user.bo.UserBo;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
   UserBo userBo;

   public UserBo getUserBo(){
       return userBo;
   } 

   public void setUserBo(UserBo userBo) {
       this.userBo = userBo;
   } 

   public String execute() throws Exception {
       userBo.printUser();
       return SUCCESS;
   }
}