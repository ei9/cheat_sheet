# Linux command cheat sheet.

- **pwd** : Print name of current/working directory
- **ls** : List what there are in current directory
- **cd** \<*path*\> : Go to certain path.
- **ps** : Shows what kind of shell you are using.

- *\<CTRL\> + Z* : Temporary stop program
- **jobs** : See how many program has been stopped. And each of them will have a task id.
- **fg** : Resume stopped program.
- *\<CTRL\> + W* : Delete last word of current typing command.
- *\<CTRL\> + U* : Delete a line of text while typing.
- *\<CTRL\> + C* : Kill a running program.
- **kill -TERM %1** : Kill a job. Where %1 means task id is 1.

- *\<up\>* and *\<down\>*: Can navigate between used commands in terminal.

- **man** : User manual. With -k parameter make it like apropos.
In fact they are same program.
- **apropos** : Search the manual page names and descriptions.
- **whatis** : display one-line manual page.
- **less** : Give you a better reading experance.
- **info** : Documentation which is more completed then man.

- *\<CTRL\> + D* : Logout from current shell.
- **passwd** : Change password.
- **pwgen** : Generate almost random password.

### su/sudo: root

Permission denied.

```
$ ls -l /lost+found

```

Using su requires root password.
And -c means execute following command with root permission.
```
$ su -c 'ls -l /lost+found'
```

And some distro like Ubuntu locked root account. Means there is no root password. So you are gonna use sudo.

```
$ sudo ls -l /lost+found
```

### Open a root shell.

```
$ sudo -i  # This will run a new root shell.
# ls -l /lost+found  # $ sign become #
# exit  # exit root shell
$
```

### Read a document

```
$ ls --help  # document is too long to fit into a page.
$ ls --help | less  # now you can read it page by page.
```

### Manual

section from (1) to (10)

```
$ man 5 passwd  # Read passwd manual section 5
```

Read all pages about certain topic.
```
$ man -a passwd  # Read all pages about passwd
```

Get help from local machine.
```
$ less /usr/share/doc/grep/README
$ zcat /usr/share/doc/info/README.gz | less
```

### Warning!! This is cool!
You can press *\<CTRL\> + \<ALT\> + F**. To swip from each virtual control center.
And one of it default is F7 will be your first login and GUI context.
You can switch to F6, login and enjoy text-based command line terminal. And go to F7 to use GUI.
