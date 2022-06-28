package blog;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import blog.service.BlogService;

public class MyApp {
	public static void main(String[] args) {

		MyApp.run(new BlogService(new BlogFileDao()));
	}

	public static void run(BlogService service) {
		Scanner scanner = new Scanner(System.in);
		String cmd;

		do {
			System.out.println("cmd > ");
			Map<String, String> map = service.process();
			Set<String> keys = map.keySet();

			for (String key : keys) {
				System.out.println(key + ": " + map.get(key));
			}

		} while ("exit".equals(cmd));
		System.out.println("Terminated");
		scanner.close();

	}
}
