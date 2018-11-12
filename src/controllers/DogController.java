package controllers;

import dao.DogStorage;
import domain.Dog;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DogController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
        int id = Integer.parseInt(req.getParameter("id"));
        Dog dog;

        if ((dog = DogStorage.getInstance().getDogById(id)) != null)
            req.setAttribute("dog", dog);
        forward("/index.jsp", req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost");
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String type = req.getParameter("type");
        String flag = req.getParameter("flag");
        System.out.println(flag);
        if (flag.equals("post")) {
            DogStorage.getInstance().update(id, name, type);
            req.setAttribute("dog", "the dog was changed");
        }
        forward("/index.jsp", req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String type = req.getParameter("type");
        DogStorage.getInstance().add(name, type);
        forward("/index.jsp", req, resp);
    }

    private void forward(String url, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher(url).forward(request, response);
    }
}

