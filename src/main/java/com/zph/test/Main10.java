package com.zph.test;


import com.alibaba.fastjson.JSONObject;

public class Main10 {

    public static void main(String[] args) {

       String str = "{\n" +
               "\t\"istodo\": [{\n" +
               "\t\t\"userid\": \"lixulian1\",\n" +
               "\t\t\"username\": \"李绪莲\",\n" +
               "\t\t\"nodeunid\": \"test00011\",\n" +
               "\t\t\"mobileurl\": \"mob5\",\n" +
               "\t\t\"pcurl\": \"mob5\",\n" +
               "\t\t\"priority\": \"\",\n" +
               "\t\t\"curnode\": \"审批中\",\n" +
               "\t\t\"extendinfo\": \"e5\",\n" +
               "\t\t\"lastupdatetime\": \"2022-06-23 15:24:05\",\n" +
               "\t\t\"isonline\": \"yes\",\n" +
               "\t\t\"permission\": \"{}\"\n" +
               "\t}],\n" +
               "\t\"isreaded\": [{\n" +
               "\t\t\"userid\": \"lixulian1\",\n" +
               "\t\t\"username\": \"李绪莲\",\n" +
               "\t\t\"nodeunid\": \"test00014\",\n" +
               "\t\t\"mobileurl\": \"mob5\",\n" +
               "\t\t\"pcurl\": \"mob5\",\n" +
               "\t\t\"priority\": \"\",\n" +
               "\t\t\"curnode\": \"审批中\",\n" +
               "\t\t\"extendinfo\": \"e5\",\n" +
               "\t\t\"lastupdatetime\": \"2022-06-23 15:24:05\",\n" +
               "\t\t\"isonline\": \"yes\",\n" +
               "\t\t\"permission\": \"{}\"\n" +
               "\t}]\n" +
               "}";

        JSONObject nodeObj = JSONObject.parseObject(str);
        System.out.println("----------transBefore--------------");
        System.out.println(nodeObj);
        System.out.println("----------transAfter--------------");
        JSONObject clubObj = new JSONObject();
        String ss = nodeObj.toString();
        System.out.println(ss);
        clubObj.put("nodeObj", ss);
        String ss1 = clubObj.toJSONString();
        System.out.println(ss1);

    }


}
