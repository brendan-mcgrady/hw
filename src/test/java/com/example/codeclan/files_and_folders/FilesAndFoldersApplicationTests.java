package com.example.codeclan.files_and_folders;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import repositories.FileRepository;
import repositories.FolderRepository;
import repositories.UserRepository;

@SpringBootTest
class FilesAndFoldersApplicationTests {

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

}
