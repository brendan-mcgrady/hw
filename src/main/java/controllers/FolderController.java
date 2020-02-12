package controllers;

import models.Folder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import repositories.FolderRepository;

import java.util.List;

@RestController
public class FolderController {

    @Autowired
    FolderRepository folderRepository;

    @GetMapping(value = "/folders")
    public List<Folder> getAllFolders() {
        return this.folderRepository.findAll();
    }


}


//    @Autowired
//    private PirateRepository pirateRepository;
//
//    @GetMapping(value = "/pirates")
//    public List<Pirate> getAllPirates(){
//        return pirateRepository.findAll();
//    }
//
//    @GetMapping(value = "/pirates/{id}")
//    public Optional<Pirate> getPirate(@PathVariable Long id){
//        return pirateRepository.findById(id);
//    }
//
//
//    @PostMapping(value = "/pirates")
//    public ResponseEntity<Pirate> createPirate(@RequestBody Pirate pirate){
//        pirateRepository.save(pirate);
//        return new ResponseEntity<>(pirate, HttpStatus.CREATED);
//    }
//
//
//    @PatchMapping(value = "/pirates/{id}")
//    public ResponseEntity<Pirate> updatePirate(@RequestBody Pirate pirate,
//    @PathVariable Long id){
//        pirateRepository.save(pirate);
//        return new ResponseEntity<>(pirate, HttpStatus.CREATED);
//    }
//}