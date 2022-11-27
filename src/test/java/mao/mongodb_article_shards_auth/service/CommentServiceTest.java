package mao.mongodb_article_shards_auth.service;

import mao.mongodb_article_shards_auth.entity.Comment;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * Project name(项目名称)：MongoDB_article
 * Package(包名): mao.mongodb_article.service
 * Class(测试类名): CommentServiceTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/11/16
 * Time(创建时间)： 20:04
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

@SpringBootTest
class CommentServiceTest
{

    @Resource
    private CommentService commentService;

    @Test
    void init()
    {
        Comment comment1 = new Comment("1", "专家说不能空腹吃饭，影响健康", new Date(), "10001",
                "u1", LocalDateTime.now(), 254, 2, "1", null, "15");
        Comment comment2 = new Comment("2", "专家说不能空腹吃饭，影响健康", new Date(), "10002",
                "u2", LocalDateTime.now(), 125, 2, "1", null, "15");
        Comment comment3 = new Comment("3", "专家说不能空腹吃饭，影响健康", new Date(), "10001",
                "u1", LocalDateTime.now(), 13, 2, "1", null, "15");
        Comment comment4 = new Comment("4", "专家说不能空腹吃饭，影响健康", new Date(), "10003",
                "u3", LocalDateTime.now(), 1056, 9, "1", null, "15");
        Comment comment5 = new Comment("5", "专家说不能空腹吃饭，影响健康", new Date(), "10004",
                "u4", LocalDateTime.now(), 4211, 38, "1", null, "15");

        commentService.saveComment(comment1);
        commentService.saveComment(comment2);
        commentService.saveComment(comment3);
        commentService.saveComment(comment4);
        commentService.saveComment(comment5);


    }

    @Test
    void saveComment()
    {
        Comment comment = new Comment("6", "专家说不能空腹吃饭，影响健康", new Date(), "10001",
                "u1", LocalDateTime.now(), 254, 2, "1", null, "15");
        commentService.saveComment(comment);
    }

    @Test
    void updateComment()
    {
        Comment comment = new Comment("6", "专家说不能空腹吃饭，影响健康", new Date(), "10001",
                "u1", LocalDateTime.now(), 9822, 9, "1", null, "15");
        commentService.updateComment(comment);
    }

    @Test
    void deleteCommentById()
    {
        commentService.deleteCommentById("6");
    }

    @Test
    void findCommentList()
    {
        List<Comment> commentList = commentService.findCommentList();
        for (Comment comment : commentList)
        {
            System.out.println(comment);
            System.out.println();
        }
    }

    @Test
    void findCommentById()
    {
        Comment comment = commentService.findCommentById("2");
        System.out.println(comment);
    }
}