# Git Commands

### Status
- `git status` - Show the status of all the files.
- `git status <file_name>` - Show the status of a specific file.

### Add/Rename/Remove
- `git add <file_name>` - Add particular file into staged form.
- `git add .` - Add all files into staged form.
- `git rm --cached <file_Name>` - Convert the file from staged form to original form.
- `git mv <old_filename> <new_filename>` - Move or rename a file, directory, or symlink.
- `git rm <file_name>` - Remove files from the working tree and from the index.

### Configuration
- `git config [<options>]`
- `git config --global user.name "Ankit Kumar Maurya"`
- `git config --global user.email "mauryaankit517@gmail.com"`
- `git config --get user.name`
- `git config --get user.email`
- `git config --global --list`
- `git config --global --list --show-origin`

### Repository
- `git init` - Initialize an empty Git repository in a specific folder.
- `git clone <repository_URL>` - Clone a repository into a new directory.

### Commit and Push
- `git commit -m "commit message"` - Record changes to the repository with a message.
- `git push origin <branch_name>` - Push changes to the remote repository.
- `git pull origin <branch_name>` - Fetch and merge changes from the remote repository.

### Branching
- `git branch` - List all branches in the repository.
- `git checkout <branch_name>` - Switch to a different branch.
- `git merge <branch_name>` - Merge a branch into the current branch.

### Log and Diff
- `git log` - Show the commit history.
- `git log <file_name>` - Show the commit history of a file.
- `git diff` - Show changes between commits, commit and working tree, etc.
- `git diff <commit1> <commit2> -- <file_name>` - Show changes made to a file.

### Stash
- `git stash` - Stash changes in a dirty working directory.
- `git stash pop` - Apply the stashed changes and remove them from the stash.

### Fetch and Rebase
- `git fetch` - Download objects and refs from another repository.
- `git rebase <branch_name>` - Reapply commits on top of another base tip.

### Tag
- `git tag <tag_name>` - Create a new tag.

### Remote
- `git remote -v` - Show all remote repositories.
- `git remote add <name> <url>` - Add a new remote repository.

### Other
- `git restore <file_Name>` - Restore the modified form to staged form, removing all modifications.
- `git archive --format=zip --output=<file.zip> <commit>` - Create an archive of files from a named tree.
- `git bisect start` - Use binary search to find the commit that introduced a bug.
- `git blame <file_name>` - Show what revision and author last modified each line of a file.
- `git reflog` - Show the history of all references.
- `git show <object>` - Show various types of objects.
- `git cherry-pick <commit>` - Apply the changes introduced by some existing commits.

### Directory
- `dir /a` - List all files and directories, including hidden ones like .git, in the current directory.