	package ir.javacup.library;

public class Library {

	private Member[] members;
	private final int capacity;
	private IdGenerator idGenerator;
	private int index = 0;

	public Library(int capacity, IdGenerator idGenerator) {
		this.capacity = capacity;
		this.members = new Member[capacity];
		this.idGenerator = idGenerator;
	}

	public void register(Member member) throws LibraryFullException {
		if (index == this.capacity) {
			throw new LibraryFullException("Library is full");
		}
		if (member == null) {
			throw new IllegalArgumentException("member is null");
		}
		if (member.getFirstName() == null) {
			throw new IllegalArgumentException("member.firstName is null");
		}
		if (member.getLastName() == null) {
			throw new IllegalArgumentException("member.lastName is null");
		}
		member.setId(this.idGenerator.generate);
		this.members[index++] = member;
	}
	
	public Member unregister(int id) {
		Member member;
		for (int i = 0; i < this.index; i++) {
			if (this.members[i] != null && this.members[i].getId() == id) {
				member = this.members[i];
				this.members[i] = null;
				return member;
			}
		}
		throw new MemberNotFoundException("No member found with the given id");
	}

	public int getMemberCount() {
		return index;
	}
	
	public boolean isFull() {
		return this.index == this.capacity;
	}
	
	public Member[] getMembers() {
		return members;
	}

	public int getCapacity() {
		return capacity;
	}

}
