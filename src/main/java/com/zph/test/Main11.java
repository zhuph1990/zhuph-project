package com.zph.test;


import com.alibaba.fastjson.JSONObject;

public class Main11 {

    public static void main(String[] args) {


        JSONObject nodeObj = new JSONObject();
        nodeObj.put("name","messi");
        nodeObj.put("age","38");
        System.out.println("----------transBefore--------------");
        System.out.println(nodeObj);
        System.out.println("----------transAfter--------------");
        JSONObject clubObj = new JSONObject();
        String ss = nodeObj.toString();
    //    System.out.println(ss);
        clubObj.put("nodeObj", ss);
        String ss1 = clubObj.toJSONString();
//        int begin = ss.indexOf("\\");
//        int end = ss.lastIndexOf("}");
        System.out.println(ss1);
        System.out.println("------------------------");
     //   System.out.println(ss1.substring(begin, end-2));

    }


}
