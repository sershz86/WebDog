package controllers;

import dao.DogStorage;
import domain.Dog;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DogController extends AbstractController{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
        int id = Integer.parseInt(req.getParameter("id"));
        if (id == -1) {
            req.setAttribute("dogList", DogStorage.getInstance().getDogs());
        } else {
            Dog dog;
            if ((dog = DogStorage.getInstance().getDogById(id)) != null)
                req.setAttribute("dog", dog);
        }
        forward("/index.jsp", req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost");
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String type = req.getParameter("type");
        if (req.getMethod().equals("POST")) {
            DogStorage.getInstance().update(id, name, type);
            req.setAttribute("dog", "the dog was changed");
        } else doPut(req, resp);
        resp.sendRedirect("/index.jsp");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String type = req.getParameter("type");
        DogStorage.getInstance().add(name, type);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doDelete");
        int id = Integer.parseInt(req.getParameter("id"));
        DogStorage.getInstance().delete(id);
    }
}

