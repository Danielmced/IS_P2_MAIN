/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.controller;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.gnome_sort.service.GnomeSortService;
import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.service.WordListService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Danielmced
 */
@Controller
public class GnomeSortController {
    
    
    @Autowired
    private WordListService wordList;
    
    @GetMapping("/gnome")
    @ResponseBody
    public String viewGnomeSort(){
        GnomeSortService gnomeService = new GnomeSortService();
        return Arrays.toString(gnomeService.gnomeSort(wordList.getWordList()));
    }
}