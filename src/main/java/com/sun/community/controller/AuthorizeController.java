package com.sun.community.controller;

import com.sun.community.dto.AccessTokenDTO;
import com.sun.community.dto.GithubUser;
import com.sun.community.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorizeController {

    @Autowired
    private GithubProvider githubProvider;

    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code")String code ,
                           @RequestParam(name = "state")String state){

        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();

        accessTokenDTO.setClient_id("1e585f4dd1a9f843beb7");
        accessTokenDTO.setClient_secret("f340a4dde621225c03f6c360626ff7fe5465203e");
        accessTokenDTO.setCode(code);
        accessTokenDTO.setRedirect_uri("http://localhost:8887/callback");
        accessTokenDTO.setState(state);
        String accessToken = githubProvider.getAccessToken(accessTokenDTO);
        GithubUser githubUser = githubProvider.getUser(accessToken);

        System.out.println(githubUser.getName());
        System.out.println(githubUser.getBio());
        System.out.println(githubUser.getId());

        return "index";
    }
}
