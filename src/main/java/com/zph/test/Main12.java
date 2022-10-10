package com.zph.test;


import com.alibaba.fastjson.JSONObject;


public class Main12 {

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
                "\t\"isunread\": [{\n" +
                "\t\t\"userid\": \"lixulian1\",\n" +
                "\t\t\"username\": \"李绪莲\",\n" +
                "\t\t\"nodeunid\": \"test00012\",\n" +
                "\t\t\"mobileurl\": \"mob5\",\n" +
                "\t\t\"pcurl\": \"mob5\",\n" +
                "\t\t\"priority\": \"\",\n" +
                "\t\t\"curnode\": \"审批中\",\n" +
                "\t\t\"extendinfo\": \"e5\",\n" +
                "\t\t\"lastupdatetime\": \"2022-06-23 15:24:05\",\n" +
                "\t\t\"isonline\": \"yes\",\n" +
                "\t\t\"permission\": \"{}\"\n" +
                "\t}],\n" +
                "\t\"isdone\": [{\n" +
                "\t\t\"userid\": \"lixulian1\",\n" +
                "\t\t\"username\": \"李绪莲\",\n" +
                "\t\t\"nodeunid\": \"test00013\",\n" +
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
        String s1 = trans1(nodeObj);
        System.out.println(s1);
        System.out.println("-------------------");
        String s2 = trans2(nodeObj);
        System.out.println(s2);

    }

    public static String trans1(JSONObject nodeObj){
        return nodeObj.toString().replaceAll("\"","\\\\\"");
    }

    public static String trans2(JSONObject nodeObj){
        JSONObject clubObj = new JSONObject();
        clubObj.put("nodeObj", nodeObj.toString());
        String str = clubObj.toString();
        int begin = str.indexOf("\\");
        int end = str.lastIndexOf("\\");
        return clubObj.toString().substring(begin-1, end+3);
    }


}
