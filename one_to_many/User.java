package one_to_many;

public class User {
	
	Post[] posts;
	String name;
	static int count;
	
	public User(String userName, int size) {
		this.name = userName;
		this.posts = new Post[size];
	}

	public void createPost(Post post) {
		
		if(count<posts.length) {
			posts[count++]=post;
			System.out.println("Post added");
		}else {
			System.out.println("Post can not be added further.");
		}
		
	}

	public void displayPost() {
		
		for(int i=0;i<count;i++) {
			Post p = posts[i];
			if(posts[i] == null) {
				System.out.println("No post is added");
				continue;
			}
			System.out.println(p.id+" post id has been allocated to "+p.name);
		}
		
	}

	public void removePost(int id) {
		
		for(int i = 0;i<count;i++) {
			Post p = posts[i];
			if(p.id == id) {
				posts[i] = null;
				System.out.println("Customer is removed by id "+p.id);
				break;
			}
			
		}
		
	}

	public void updatePost(int oldPid, int newPid) {
		for(int i=0;i<posts.length;i++) {
			Post p = posts[i];
			if(p.id == oldPid) {
				p.id=newPid;
				System.out.println("New id is updated to "+p.id);
				break;
			}else {
				System.out.println("id is not found");
			}
		}
	}
	
	
	
}
