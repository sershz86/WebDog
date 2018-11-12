<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <script type="text/javascript" src="js/scripts.js"></script>
    <title>index</title>
  </head>
  <body>
  <form name="hid">
      <input type="hidden" name="param" value="post">
  </form>
  <form action="dog" name="gettingForm" method="get">
      <input type="text" name="id" value="">
      <input type="submit" value="get">
  </form>
  <form action="dog" name="postingForm" method="post">
    <input type="text" name="id" value="">
    <input type="text" name="name" value="">
    <input type="text" name="type" value="">
    <input type="submit" value="post">
  </form>
  <form action="dog" name="puttingForm" method="">
    <input type="text" name="id" value="">
    <input type="text" name="name" value="">
    <input type="text" name="type" value="">
    <input type="submit" value="post">
  </form>
  ${dog}
  </body>
</html>
