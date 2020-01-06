# 松耦合代码示例
当需要输出改变时，不必修改任何代码 .java 文件，只要修改 SpringBeans.xml 文件 <property name="outputGenerator" ref="CsvOutputGenerator" /> 中的 ref 值，就可以实现输出不同的内容，不修改代码就减少了出错的可能性。
