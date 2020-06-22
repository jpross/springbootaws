package com.ringi.boot;

import com.samskivert.mustache.Mustache;
import com.samskivert.mustache.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.io.IOException;
import java.io.Writer;
import java.time.LocalDateTime;
import java.util.Map;

/*
@ControllerAdvice
class LayoutAdvice {

    private final Mustache.Compiler compiler;

    @Autowired
    public LayoutAdvice(Mustache.Compiler compiler) {
        this.compiler = compiler;
    }

    @ModelAttribute("layout")
    public Mustache.Lambda layout(Map<String, Object> model) {
        return new Layout(compiler);
    }

}

class Layout implements Mustache.Lambda {
    String Title = "스프링부트 웹서비스";
    String Date = String.valueOf(LocalDateTime.now().getYear());
    String Body = "";

    private Mustache.Compiler compiler;

    public Layout(Mustache.Compiler compiler) {
        this.compiler = compiler;
    }

    @Override
    public void execute(Template.Fragment fragment, Writer writer) throws IOException {
        Body = fragment.execute();
        compiler.compile("{{>layout}}").execute(fragment.context(), writer);
    }
}*/
