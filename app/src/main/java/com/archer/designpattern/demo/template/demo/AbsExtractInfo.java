package com.archer.designpattern.demo.template.demo;

import java.util.List;

/**
 * 一个爬虫程序，用到了模版方法模式：
 * 需求分析：程序需要对特定的20个网站进行抓取数据；每个网站页面返回的结果数据不同，url不同，参数不同等；但是抓取的过程是一致的。
 * 可以这样设计：
 *      a、定义一个规则Rule类（包含了：url，params，request_method，以及返回哪块数据【根据选择器】）
 *      b、通过Rule进行抓取数据
 *      c、对数据进行处理
 */

public abstract class AbsExtractInfo {
    /**
     * 抓取的算法骨架
     */
    public void extract() {
        Rule rule = generateRule() ;
        List<Element> elements = getInfosByRule(rule);
        dealResult(elements);
    }

    /**
     * 生成一个Rule
     */
    public abstract Rule generateRule();

    /**
     * 抓取的实现
     */
    private List<Element> getInfosByRule(Rule rule) {
        // the implements omitted
        return null;
    }
    /**
     * 处理抓取的结果
     */
    public abstract void dealResult(List<Element> results);
}
