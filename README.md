# JianZhiOffer
Java刷题剑指Offer，源码放在src文件夹中。
异常处理、返回值、输入输出视情况而定。

## 二维数组中的查找
在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

1、不清楚循环次数，用while循环；
2、从右上角开始遍历；

## 替换空格
请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。

1、循环旧字符串，将字符串扩增（一个空格加长度2）   
2、i为原长度取得字符c，j为新长度str增加%20或c，从后往前遍历

StringBuffer类：
StringBuffer str = new StringBuffer() //new对象,初始为空  
        str.charAt(i) //取i位的字符值  
        str.append("1a2") //末尾拼接字符1a2  
        str.setCharAt(j, c) //j位置换为字符c  
        str.toString() //输出字符串  
        