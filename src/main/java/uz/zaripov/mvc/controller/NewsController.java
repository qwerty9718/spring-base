package uz.zaripov.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uz.zaripov.mvc.dao.NewsDAO;
import uz.zaripov.mvc.model.News;

@Controller
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsDAO newsDAO;

    @GetMapping
    public String getNewsList(Model model){
        model.addAttribute("newsList",newsDAO.getNewsList());
        return "news/news";
    }


    @GetMapping("/{id}")
    public String getNewsById(@PathVariable("id") int id, Model model){
        model.addAttribute("news", newsDAO.show(id));
        return "news/showById";
    }


    @GetMapping("/create")
    public String newsForm(Model model){
        model.addAttribute("news", new News());
        return "news/createForm";
    }

    @PostMapping("/save")
    public String createNews(@ModelAttribute("news") News news){
        newsDAO.createNews(news);
        return "redirect:/news";
    }


    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable("id") int id,Model model){
        News news = newsDAO.show(id);
        model.addAttribute("news", news);
        return "news/edit";
    }

    @PatchMapping("/{id}")
    public String updateNews(@PathVariable("id") int id, @ModelAttribute("news") News news){
        newsDAO.updateNews(id, news);
        return "redirect:/news";
    }

    @DeleteMapping("/{id}")
    public String deleteNews(@PathVariable("id") int id){
        newsDAO.delete(id);
        return "redirect:/news";
    }

}
