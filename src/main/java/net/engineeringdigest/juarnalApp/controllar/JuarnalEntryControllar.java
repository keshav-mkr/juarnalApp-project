package net.engineeringdigest.juarnalApp.controllar;

import net.engineeringdigest.juarnalApp.entity.JuarnalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/juarnal")
public class JuarnalEntryControllar {

    private Map<Long , JuarnalEntry> juarnalEntries = new HashMap<>();


    @PostMapping("/addEntities")
    public boolean crateEntity(@RequestBody JuarnalEntry myEntry){
        juarnalEntries.put(myEntry.getId(),myEntry);
        return true;
    }

    @GetMapping("entities")
    public List<JuarnalEntry> getJuarnalEntities(){

        return new ArrayList<>(juarnalEntries.values());
    }

    @GetMapping("id/{myID}")
    public JuarnalEntry getJuarnalEntityByID(@PathVariable Long myID){

        return juarnalEntries.get(myID);
    }

   @DeleteMapping("id/{myID}")
    public JuarnalEntry deletJuarnalEntityByID(@PathVariable Long myID){

        return juarnalEntries.remove(myID);
    }

    @PutMapping("id/{id}")
    public JuarnalEntry putJuarnalEntityByID(@PathVariable Long id, @RequestBody JuarnalEntry myEntry){

         juarnalEntries.put(id,myEntry);
         return juarnalEntries.get(id);
    }
}
