package org.example.prac02_back.config.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.example.prac02_back.util.JwtUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@RequiredArgsConstructor
@Component
public class JwtFilter extends OncePerRequestFilter {
    private final JwtUtil jwtUtil;
    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
        String path = request.getServletPath();

        return path.startsWith("/user/signup") ||
                path.startsWith("/user/login");
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        if (request.getCookies() != null){
            for (Cookie cookie : request.getCookies()){
                if(cookie.getName().equals("ATOKEN")){

                }
            }
        }
    }
}
