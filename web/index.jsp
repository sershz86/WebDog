<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <script type="text/javascript" src="js/scripts.js"></script>
    <title>index</title>
  </head>
  <body>
  <form name="hid">
    <input id="methodType" type="hidden" name="flag" value="${flag}">
  </form>
  <form action="dog" name="gettingForm" method="get">
      <input type="text" name="id" value="">
      <input type="submit" value="get">
  </form>
  <form action="dog" name="postingForm" method="post">
    <input type="text" name="id" value="">
    <input type="text" name="name" value="">
    <input type="text" name="type" value="">
    <input type="button" value="post" onclick="post('post'<%=%>)">
  </form>
  ${dog}
  </body>
</html>
