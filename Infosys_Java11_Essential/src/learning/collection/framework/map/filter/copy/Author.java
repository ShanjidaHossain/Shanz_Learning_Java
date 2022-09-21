package learning.collection.framework.map.filter.copy;
class Author {
		private Integer authorId;
		private String authorName;

		public Integer getAuthorId() {
			return authorId;
		}

		public void setAuthorId(Integer authorId) {
			this.authorId = authorId;
		}

		public String getAuthorName() {
			return authorName;
		}

		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}

		public Author(Integer authorId, String authorName) {
			this.authorId = authorId;
			this.authorName = authorName;
		}
	}