package com.mkyong.user.action;

import com.mkyong.user.bo.UserBo;

public class UserSpringAction {
  UserBo userBo;
    
  public UserBo getUserBo() { return userBo; }

  public void setUserBo( UserBo _userBo ) {
      userBo = _userBo;
  }  

  public String execute() throws Exception {
     userBo.printUser();
     return "success"; 
  }
}
