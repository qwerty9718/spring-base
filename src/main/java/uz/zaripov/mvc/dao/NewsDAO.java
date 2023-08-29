package uz.zaripov.mvc.dao;

import org.springframework.stereotype.Component;
import uz.zaripov.mvc.model.News;

import java.util.ArrayList;
import java.util.List;

@Component
public class NewsDAO {

    List<News> newsList;
    private static int NEWS_COUNT = 1;

    {
        News news = new News(NEWS_COUNT++,"Football","Lorem Ipsum is simply dummy text of the printing and typesetting Lorem Ipsum is simply dummy text of the printing and typesetting");
        News news1 = new News(NEWS_COUNT++,"Basketball","Lorem Ipsum is simply dummy text of the printing and typesetting Lorem Ipsum is simply dummy text of the printing and typesetting");
        News news2 = new News(NEWS_COUNT++,"TV Shows","Lorem Ipsum is simply dummy text of the printing and typesetting Lorem Ipsum is simply dummy text of the printing and typesetting");
        News news3 = new News(NEWS_COUNT++,"Box","Lorem Ipsum is simply dummy text of the printing and typesetting Lorem Ipsum is simply dummy text of the printing and typesetting");
        News news4 = new News(NEWS_COUNT++,"UFC","Lorem Ipsum is simply dummy text of the printing and typesetting Lorem Ipsum is simply dummy text of the printing and typesetting");
        newsList = new ArrayList<>();
        newsList.add(news);
        newsList.add(news1);
        newsList.add(news2);
        newsList.add(news3);
        newsList.add(news4);
    }


    public List<News> getNewsList(){
        return newsList;
    }


    public News show(int id){
        for (News news : newsList) {
            if (news.getId() == id){
                return news;
            }
        }
        return null;
    }


    public void createNews(News news){
        news.setId(NEWS_COUNT++);
        newsList.add(news);
    }


    public void updateNews(int id, News news){
        News currentNews = show(id);
        currentNews.setName(news.getName());
        currentNews.setText(news.getText());
    }


    public void delete(int id) {
        for (News news : newsList) {
            if (news.getId() == id){
                newsList.remove(news);
                break;
            }
        }
    }
}
