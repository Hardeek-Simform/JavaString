package com.string;

public class Main {
    public static void main(java.lang.String[] args) {
        String topicName = "Java String";
        StringBuffer introduction = new StringBuffer();
        StringBuilder mainContent = new StringBuilder();

        introduction.append("In Java, string is basically an object that represents sequence of char values.\n");
        introduction.append("Java String class provides a lot of methods to perform operations on strings such as compare(),\n");
        introduction.append("concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring() etc.\n");
        introduction.append("The java.lang.String class is used to create a string object.\n");
        introduction.append("The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.\n");

        mainContent.append("There are two ways to create String object:\n");
        mainContent.append("1. By string literal:Each time you create a string literal, the JVM checks the\n");
        mainContent.append("\"string constant pool\" first. If the string already exists in the pool, a reference\n");
        mainContent.append("to the pooled instance is returned. If the string doesn't exist in the pool, a new string\n");
        mainContent.append("instance is created and placed in the pool.\n");
        mainContent.append("2. By new keyword: In such case, JVM will create a new string object in normal (non-pool)\n");
        mainContent.append("heap memory, and the literal \"Welcome\" will be placed in the string constant pool. The variables\n");
        mainContent.append("will refer to the object in a heap (non-pool).\n");

        System.out.println("---------------- Before uppercase and trim function ---------------:");
        System.out.println("Topic name : " + topicName);
        System.out.println("\nIntroduction :: \n" + introduction);
        System.out.println("\nBrief of the topic :: \n" + mainContent);

        System.out.println("-------- After uppercase and trim function : ----------\n" +
                "\nTopic Name: : " + topicName.trim().toUpperCase());
        System.out.println("\nIntroduction ::::: \n" + introduction.toString().trim().toUpperCase());
        System.out.println("\nBrief of the topic ::::: \n" + mainContent.toString().trim().toUpperCase());
    }
}