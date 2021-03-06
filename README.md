# cmpld
This is a simple tool to run scripts in your favorite language as if they were compiled.

At the first run, the file is compiled and the result is stored in `~/.cmpld/hashed/`.
In all later runs, the compiled version is used.
Thus, the first run will take (much) longer than the following ones.

## Installation
Put the cmpld script in `/bin/` and make it executable (`chmod +x /bin/cmpld`).

## Usage
Prepend `#!/bin/cmpld` to your source.

Currently, compilation is only built-in for `.c`, `.java`, `.rs`, `.go` and `.scala` files, but you can always put a script to `~/.cmpld/compile/<fileextension>` that takes the source file as first argument and creates an executable file `run`.


## Example

```bash
$ cat test.java 
#!/bin/cmpld

public class test {
	public static void main(String[] args) {
		if (args.length >= 1) {
			System.out.println("Hello " + args[0] + "!");
		} else {
			System.out.println("Hello World!");
		}
	}
}

$ time ./test.java WORLD
Hello WORLD!

real	0m29,159s
user	4m1,618s
sys	0m9,748s
$ time ./test.java WORLD
Hello WORLD!

real	0m0,012s
user	0m0,006s
sys	0m0,006s
```
