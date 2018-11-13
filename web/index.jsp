<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <script type="text/javascript" src="/js/scripts.js"></script>
    <title>index</title>
  </head>
  <body>

      <input type="hidden" name="param" value="">

  <form action="dog" name="gettingForm" method="get">
      <input type="text" name="id" value="">
      <input type="submit" value="get">
  </form>
  <form action="dog" name="postingForm" method="post">
    <input type="hidden" name="paramHolder" value="${param}">
    <input type="text" name="id" value="">
    <input type="text" name="name" value="">
    <input type="text" name="type" value="">
    <input type="button" value="post" onclick="post('post')">
  </form>
  <form action="dog" name="puttingForm" method="post">
    <input type="hidden" name="paramHolder" value="${param}">
    <input type="text" name="id" value="">
    <input type="text" name="name" value="">
    <input type="text" name="type" value="">
    <input type="button" value="post" onclick="put('put')">
  </form>

  ${dog}
  ${dogList}
  </body>
</html>
