<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>红上-hoomsun</title>
        <link type="text/css" rel="stylesheet" media="all" href="/netctoss/styles/global.css" />
        <link type="text/css" rel="stylesheet" media="all" href="/netctoss/styles/global_color.css" /> 
    	
    
    </head>
    <body class="index">
    	<h1>欢迎访问</h1>
    		
       
    	查询
    	<form action="toFind.do"  method="post">
    		<input  type="text" name="id" />
    		<input  type="radio"  name="ceshi" value="1"  />
    		<input  type="radio"  name="ceshi" value=2  />
    		<input  type="radio"  name="ceshi" value=3  />
     		<input  type="submit"  value="提交" />
    	</form>
    	<p>${name}</p>
    </body>
</html>
