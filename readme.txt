git status     //  to know the status of all the file
git status <file_name>     // Show the status of a specific file:
git rm --cached <file_Name>    // to convert the file from staged form to original form 
git init            // to initializing empty Git repository in that Specific folder
git restore <file_Name>   // to restore the modified form to staged form i.e. removing all modification 
git add  <file_Name>   // add particular file into stagged form 
git add .      // add all files into stagged form
dir /a      // this command will list all files and directories, including hidden ones like .git, in the current directory
git config [<options>]
git config --global user.name "Ankit Kumar Maurya"
git config --global user.email "mauryaankit517@gmail.com"
git config --get user.name
git config --get user.email
git config --global --list
git config --global --list --show-origin
git clone <repository_URL>   // Clone a repository into a new directory
git commit -m "commit message"   // Record changes to the repository with a message
git push origin <branch_name>   // Push changes to the remote repository
git pull origin <branch_name>   // Fetch and merge changes from the remote repository
git branch   // List all branches in the repository
git checkout <branch_name>   // Switch to a different branch
git merge <branch_name>   // Merge a branch into the current branch
git log   // Show the commit history
git log <file_name>   //show the commit history of a file
git diff   // Show changes between commits, commit and working tree, etc.
git diff <commit1> <commit2> -- <file_name>   //Show changes made to a file
git stash   // Stash changes in a dirty working directory
git stash pop   // Apply the stashed changes and remove them from the stash
git fetch   // Download objects and refs from another repository
git rebase <branch_name>   // Reapply commits on top of another base tip
git reset <commit>   // Reset current HEAD to the specified state
git tag <tag_name>   // Create a new tag
git show <object>   // Show various types of objects
git remote -v   // Show all remote repositories
git remote add <name> <url>   // Add a new remote repository
git mv <old_filename> <new_filename>   // Move or rename a file, directory, or symlink
git rm <file_name>   // Remove files from the working tree and from the index
git cherry-pick <commit>   // Apply the changes introduced by some existing commits
git archive --format=zip --output=<file.zip> <commit>   // Create an archive of files from a named tree
git bisect start   // Use binary search to find the commit that introduced a bug
git blame <file_name>   // Show what revision and author last modified each line of a file
git reflog   // Show the history of all references