# My Vim cheat sheet for quick reference.

### Commonly used command.
```
<i>  # Enter edit mode to insert words
<Esc>  # Go to normal mode.
:up <FILE NAME>  # save a file
:saveas <FILE NAME>  # save as other file
:q  # quit vim
:w  # write content to file
:wq  # write & exit vim
```

### Warrning!
if you press \<CTRL\> + S to save files like normal GUI editor, then the terminal would stopped.
In order to solve this problem. Press \<CTRL\> + Q.
I found the solution on [StackOverflow](https://stackoverflow.com/a/32118022)

### To make my vim more easier to use. Below is my .vimrc file.

```
" Show line number
set number

" Show trailing whitespace
highlight ExtraWhitespace ctermbg=darkgreen guibg=darkgreen
match ExtraWhitespace /\s\+$/


" Reference for the following settings:
" https://linuxdigest.com/howto/how-to-autoindent-in-vim/

" Set auto indent for C code
set cindent

" Expand tab into 4 spaces when hit tab
set expandtab
" how many spaces are inserted for every tab
set tabstop=4
" determine how many spaces make up one level of indentation
set shiftwidth=4
```
