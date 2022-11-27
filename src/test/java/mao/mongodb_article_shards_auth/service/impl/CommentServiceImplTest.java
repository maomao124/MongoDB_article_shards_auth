package mao.mongodb_article_shards_auth.service.impl;

import mao.mongodb_article_shards_auth.service.CommentService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * Project name(项目名称)：MongoDB_article
 * Package(包名): mao.mongodb_article.service.impl
 * Class(测试类名): CommentServiceImplTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/11/16
 * Time(创建时间)： 21:13
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

@SpringBootTest
class CommentServiceImplTest
{

    @Resource
    private CommentService commentService;

    @Test
    void updateCommentLikeNum()
    {
        commentService.updateCommentLikeNum("1");
    }
}