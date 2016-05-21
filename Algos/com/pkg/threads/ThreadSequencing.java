package com.pkg.threads;

public class ThreadSequencing {

	int val = 1;
	int count;
	public static void main(String[] args) {
		ThreadSequencing m = new ThreadSequencing();
		Thread1  t1 = new Thread1(m);
		Thread2  t2 = new Thread2(m);
		t1.start();
		t2.start();
	}

}

class Thread1 extends Thread {

	private ThreadSequencing mutex;

	public Thread1(ThreadSequencing mutex) {
		this.mutex = mutex;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (mutex) {
				if (mutex.val != 1) {
					try {
						mutex.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					System.out.print(mutex.val + " ");
					mutex.val = 2;
					mutex.notifyAll();
				}

			}
			if(mutex.count == 5){
				break;
			}
		}
	}
}


class Thread2 extends Thread {

	private ThreadSequencing mutex;

	public Thread2(ThreadSequencing mutex) {
		this.mutex = mutex;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (mutex) {
				if (mutex.val != 2) {
					try {
						mutex.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					System.out.print(mutex.val + " ");
					mutex.val = 1;
					mutex.count++;
					mutex.notifyAll();
				}

			}
			if(mutex.count == 5){
				break;
			}
		}
	}
}